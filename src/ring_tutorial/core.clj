(ns ring-tutorial.core (:use [ring.adapter.jetty :only [run-jetty]]))

(defn handler [request]
 {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, Udacity!"})

(defn -main [port]
	(run-jetty handler {:port (Integer. port)}))
