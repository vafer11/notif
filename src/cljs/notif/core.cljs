(ns notif.core
  (:require [reagent.dom :as rdom]))

(def clases {:S "notification is-success is-light visible"
             :W "notification is-warning is-light visible"
             :E "notification is-danger is-light visible"})

(defn hidde-toast [toast]
  (set! (.-className toast) (.replace (.-className toast) "visible" "")))

(defn notification [text]
  [:div#toast
   [:button.delete {:on-click #(hidde-toast (.getElementById js/document "toast"))}]
   [:p#toast-msg "I'm a simple notification"]])

(defn show-toast [{:keys [text type]}]
  (let [toast (.getElementById js/document "toast")
        toast-msg (.getElementById js/document "toast-msg")]
    (set! (.-className toast) (type clases))
    (set! (.-textContent toast-msg)  text)
    (js/setTimeout #(hidde-toast toast) 3000)))
