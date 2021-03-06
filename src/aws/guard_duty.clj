(ns aws.guard-duty
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.guard-duty/member
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.guard-duty/member-id
    :aws.guard-duty/email
    :aws.guard-duty/detector-id]
   :opt
   [:aws.guard-duty/status
    :aws.guard-duty/message
    :aws.guard-duty/disable-email-notification]))
 (clojure.spec.alpha/def :aws.guard-duty/status clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/member-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/email clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/message clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/disable-email-notification
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.guard-duty/detector-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.guard-duty/threat-intel-set
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.guard-duty/format
    :aws.guard-duty/activate
    :aws.guard-duty/detector-id
    :aws.guard-duty/location]
   :opt
   [:aws.guard-duty/name]))
 (clojure.spec.alpha/def :aws.guard-duty/format clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/activate
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.guard-duty/detector-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/location clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.guard-duty/master
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.guard-duty/detector-id
    :aws.guard-duty/master-id
    :aws.guard-duty/invitation-id]
   :opt
   []))
 (clojure.spec.alpha/def
  :aws.guard-duty/detector-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/master-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/invitation-id
  clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.guard-duty/detector
  [___16342__auto__]
  (clojure.spec.alpha/keys :req [:aws.guard-duty/enable] :opt []))
 (clojure.spec.alpha/def :aws.guard-duty/enable clojure.core/boolean?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.guard-duty/ip-set
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.guard-duty/format
    :aws.guard-duty/activate
    :aws.guard-duty/detector-id
    :aws.guard-duty/location]
   :opt
   [:aws.guard-duty/name]))
 (clojure.spec.alpha/def :aws.guard-duty/format clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.guard-duty/activate
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.guard-duty/detector-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.guard-duty/location clojure.core/string?))
