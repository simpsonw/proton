(ns proton.layers.lang.php.core
  (:use [proton.layers.base :only [init-layer! get-initial-config get-keybindings get-packages get-keymaps]]))

(defmethod get-initial-config :lang/php [] [])

(defmethod init-layer! :lang/php
  [_ {:keys [config layers]}]
  (println "hello world"))

(defmethod get-keybindings :lang/php
  []
  { :t {:category "toggle"
          :d {:category "debugging"
            :p {:action "php-debug:toggleDebugging" :title "php debugging"}}}})

(defmethod get-packages :lang/php []
  [
   :php-debug
  ])
