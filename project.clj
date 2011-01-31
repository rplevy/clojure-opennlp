(defproject rplevy/clojure-opennlp "0.1.3-SNAPSHOT"
  :description "Natural Language Processing with Clojure, library for opennlp. http://github.com/dakrone/clojure-opennlp"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [opennlp/tools "1.5.0"]]
  :dev-dependencies [[marginalia "0.3.2"]]
  :jvm-opts ["-Xmx1024m"]
  :repositories {"opennlp.sf.net" "http://opennlp.sourceforge.net/maven2"})

