
## Instalar Chrome

``` 
wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
sudo sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list'
sudo apt update
sudo apt install google-chrome-stable
```

## Instalar GIT

```
sudo apt install git
```

## Instalar gdebi

```
sudo apt install gdebi
```

## Instalar curl

```
sudo apt install curl
```

## Instalar jdk

```
sudo apt install openjdk-17-jdk-headless
```

## Instalar graphviz

```
sudo apt install graphviz
```


## Instalar Spotify

```
curl -sS https://download.spotify.com/debian/pubkey_5E3C45D7B312C643.gpg | sudo apt-key add - 
echo "deb http://repository.spotify.com stable non-free" | sudo tee /etc/apt/sources.list.d/spotify.list
sudo apt-get update && sudo apt-get install spotify-client
```

## Instalar VLC

```
sudo apt install vlc
```

## Otras cosas...

* Configurar captura de pantalla (WIN+MAYUSC+S)

### Instalar elementary Tweaks

```
sudo apt install software-properties-common
sudo add-apt-repository ppa:philip.scott/pantheon-tweaks
sudo apt update
sudo apt install pantheon-tweaks
```

### Instalar la impresora

Instalar el [Driver CQue DEB](https://www.canon.es/support/products/imagerunner/imagerunner-advance-c5235i.html?type=drivers&driverdetailid=tcm:86-1894069&os=linux%20%2864-bit%29&language=es)

```
sudo systemctl stop cups
sudo vi /etc/cups/printers.conf
# Editar la IP
sudo systemctl restart cups
```