(ns ring-tutorial.core (:require ring.adapter.jetty)
	(:refer ring.adapter.jetty))

(defn handler [request]
 {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, World!"})
   
(run-jetty handler {:port 3000})

(comment
Run from command line: $ lein run

Or comment out run-jetty line and run in REPL
$ lein repl

=> (require 'ring.adapter.jetty)
=> (refer 'ring.adapter.jetty)
=> (require 'hello-world.core)
=> (refer 'hello-world.core)
=> (run-jetty handler {:port 3000})

or

=> (use 'ring.adapter.jetty)
=> (use 'hello-world.core)
=> (run-jetty handler {:port 3000})

)