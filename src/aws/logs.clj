(ns aws.logs
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.logs/metric-filter
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.logs/filter-pattern
    :aws.logs/log-group-name
    :aws.logs/metric-transformations]
   :opt
   []))
 (clojure.spec.alpha/def :aws.logs/filter-pattern clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/log-group-name clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.logs/log-group
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.logs/log-group-name :aws.logs/retention-in-days]))
 (clojure.spec.alpha/def :aws.logs/log-group-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.logs/retention-in-days
  clojure.core/integer?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.logs/log-stream
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.logs/log-group-name]
   :opt
   [:aws.logs/log-stream-name]))
 (clojure.spec.alpha/def :aws.logs/log-group-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.logs/log-stream-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.logs/destination
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.logs/destination-name
    :aws.logs/destination-policy
    :aws.logs/role-arn
    :aws.logs/target-arn]
   :opt
   []))
 (clojure.spec.alpha/def
  :aws.logs/destination-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.logs/destination-policy
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/target-arn clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.logs/subscription-filter
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.logs/destination-arn
    :aws.logs/filter-pattern
    :aws.logs/log-group-name]
   :opt
   [:aws.logs/role-arn]))
 (clojure.spec.alpha/def
  :aws.logs/destination-arn
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/filter-pattern clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/log-group-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/role-arn clojure.core/string?))
(do
 (clojure.spec.alpha/def :aws.logs/metric-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.logs/metric-namespace
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.logs/metric-value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.logs/metric-transformation
  (clojure.spec.alpha/keys
   :req
   [:aws.logs/metric-name
    :aws.logs/metric-namespace
    :aws.logs/metric-value]
   :opt
   [])))
