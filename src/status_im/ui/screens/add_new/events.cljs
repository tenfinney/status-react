(ns status-im.ui.screens.add-new.events
  (:require [status-im.ui.screens.add-new.models :as models]
            [status-im.utils.handlers :as handlers]
            [status-im.utils.log :as log]))

(handlers/register-handler-fx
 :handle-qr-code
 (fn [cofx [_ _ data]]
   (log/debug "qr code scanned with data " data)
   (models/handle-qr-code cofx data)))
