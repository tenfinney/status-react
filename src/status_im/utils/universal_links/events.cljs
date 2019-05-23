(ns status-im.utils.universal-links.events
  (:require [status-im.utils.handlers :as handlers]
            [status-im.utils.universal-links.core :as universal-links]
            [status-im.utils.log :as log]))

(handlers/register-handler-fx
 :handle-universal-link
 (fn [cofx [_ url]]
   (log/debug "universal links: event received for " url)
   (universal-links/handle-url cofx url)))
