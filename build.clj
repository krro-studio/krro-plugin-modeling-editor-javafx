(ns build
  (:require [top.kzre.clj-build-template.simple :as tpl]))

(def params {:template (tpl/create-template)
             :artifact "krro-plugin-modeling-editor-javafx"
             :version "0.1.0"})

(defn clean [_]
      (tpl/clean))

(defn jar [_]
      (tpl/jar params))

(defn install [_]
      (tpl/install params))