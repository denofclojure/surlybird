# surlybird

The API layer for project openbike (http://openbike.co) The initial implementation takes JSON blobs from a mobile app and updates the openbike map. This is designed to work with [Android Tracks](https://github.com/denofclojure/androidtracks "Android Tracks")

## Usage

If you want to start the webserver and open a browser to the root page:

   lein ring server

If you don't want a browser or are running this code on a headless server or VM:

   lein ring server-headless

Port forward from your VM through denofclojure.org

   ssh -fNR 3333:localhost:3000 your-name-at@denofclojure.org

## License

Copyright © 2013 The Den of Clojure

Distributed under the Eclipse Public License, the same as Clojure.
