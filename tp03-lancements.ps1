# Rejoue les six lancements de l'étape 12 du TP 03 et affiche la ligne ">>>" de chacun.
# Prérequis : ./mvnw package a été lancé. Usage : .\tp03-lancements.ps1
$jar  = "target\bestioles-0.0.1-SNAPSHOT.jar"
$port = "--server.port=8080"   # mettre 8081 si le 8080 est pris

function Lancer($titre, $arguments, $variables) {
    foreach ($v in $variables.Keys) { Set-Item -Path "Env:$v" -Value $variables[$v] }
    $out = [System.IO.Path]::GetTempFileName()
    $err = [System.IO.Path]::GetTempFileName()
    $p = Start-Process java -ArgumentList (@("-jar", $jar, $port) + $arguments) `
            -RedirectStandardOutput $out -RedirectStandardError $err -PassThru -NoNewWindow
    $ligne = $null
    for ($i = 0; $i -lt 60 -and -not $ligne; $i++) {
        Start-Sleep -Milliseconds 500
        $ligne = Select-String -Path $out -Pattern "^>>>" | Select-Object -First 1
        if ($p.HasExited) { break }
    }
    if (-not $p.HasExited) { Stop-Process -Id $p.Id -Force }
    foreach ($v in $variables.Keys) { Remove-Item "Env:$v" -ErrorAction SilentlyContinue }
    if ($ligne) { $resultat = $ligne.Line } else { $resultat = "(pas de ligne >>> : voir $err et $out)" }
    Write-Host ("{0,-60} {1}" -f $titre, $resultat)
}

Lancer "1 java -jar"                                   @() @{}
Lancer "2 profil dev"                                  @("--spring.profiles.active=dev") @{}
Lancer "3 dev + variable CAPACITEMAX=3"                @("--spring.profiles.active=dev") @{ BESTIOLES_REFUGE_CAPACITEMAX = "3" }
Lancer "4 dev + argument capacite-max=2"               @("--spring.profiles.active=dev", "--bestioles.refuge.capacite-max=2") @{}
Lancer "5 dev + variable 3 + argument 2"               @("--spring.profiles.active=dev", "--bestioles.refuge.capacite-max=2") @{ BESTIOLES_REFUGE_CAPACITEMAX = "3" }
Lancer "6 SPRING_PROFILES_ACTIVE=dev (sans argument)"  @() @{ SPRING_PROFILES_ACTIVE = "dev" }
