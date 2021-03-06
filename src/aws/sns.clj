(ns aws.sns
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.sns/topic-policy
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.sns/policy-document :aws.sns/topics]
   :opt
   []))
 (clojure.spec.alpha/def :aws.sns/policy-document clojure.core/any?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.sns/subscription
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.sns/endpoint :aws.sns/protocol :aws.sns/topic-arn]))
 (clojure.spec.alpha/def :aws.sns/endpoint clojure.core/string?)
 (clojure.spec.alpha/def :aws.sns/protocol clojure.core/string?)
 (clojure.spec.alpha/def :aws.sns/topic-arn clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.sns/topic
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.sns/display-name :aws.sns/subscription :aws.sns/topic-name]))
 (clojure.spec.alpha/def :aws.sns/display-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.sns/topic-name clojure.core/string?))
(do
 (clojure.spec.alpha/def :aws.sns/endpoint clojure.core/string?)
 (clojure.spec.alpha/def :aws.sns/protocol clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.sns/subscription
  (clojure.spec.alpha/keys
   :req
   [:aws.sns/endpoint :aws.sns/protocol]
   :opt
   [])))
