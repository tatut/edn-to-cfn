(ns aws.route53
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.route53/record-set-group
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.route53/comment
    :aws.route53/hosted-zone-id
    :aws.route53/hosted-zone-name
    :aws.route53/record-sets]))
 (clojure.spec.alpha/def :aws.route53/comment clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-name
  clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.route53/health-check
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/health-check-config]
   :opt
   [:aws.route53/health-check-tags])))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.route53/hosted-zone
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/name]
   :opt
   [:aws.route53/hosted-zone-config
    :aws.route53/hosted-zone-tags
    :aws.route53/query-logging-config
    :aws.route53/vp-cs]))
 (clojure.spec.alpha/def :aws.route53/name clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.route53/record-set
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/type :aws.route53/name]
   :opt
   [:aws.route53/alias-target
    :aws.route53/comment
    :aws.route53/hosted-zone-name
    :aws.route53/geo-location
    :aws.route53/ttl
    :aws.route53/set-identifier
    :aws.route53/weight
    :aws.route53/health-check-id
    :aws.route53/hosted-zone-id
    :aws.route53/resource-records
    :aws.route53/failover
    :aws.route53/region]))
 (clojure.spec.alpha/def :aws.route53/comment clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/ttl clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/set-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/weight clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.route53/health-check-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/failover clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/region clojure.core/string?))
(do
 (clojure.spec.alpha/def :aws.route53/key clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/health-check-tag
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/key :aws.route53/value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.route53/dns-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/evaluate-target-health
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/alias-target
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/dns-name :aws.route53/hosted-zone-id]
   :opt
   [:aws.route53/evaluate-target-health])))
(do
 (clojure.spec.alpha/def :aws.route53/key clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-tag
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/key :aws.route53/value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.route53/comment clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-config
  (clojure.spec.alpha/keys :req [] :opt [:aws.route53/comment])))
(do
 (clojure.spec.alpha/def :aws.route53/dns-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/evaluate-target-health
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/alias-target
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/dns-name :aws.route53/hosted-zone-id]
   :opt
   [:aws.route53/evaluate-target-health])))
(do
 (clojure.spec.alpha/def
  :aws.route53/continent-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/country-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/subdivision-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/geo-location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.route53/continent-code
    :aws.route53/country-code
    :aws.route53/subdivision-code])))
(do
 (clojure.spec.alpha/def :aws.route53/comment clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/ttl clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/set-identifier
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/weight clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.route53/health-check-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/hosted-zone-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/failover clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/region clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/record-set
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/type :aws.route53/name]
   :opt
   [:aws.route53/alias-target
    :aws.route53/comment
    :aws.route53/hosted-zone-name
    :aws.route53/geo-location
    :aws.route53/ttl
    :aws.route53/set-identifier
    :aws.route53/weight
    :aws.route53/health-check-id
    :aws.route53/hosted-zone-id
    :aws.route53/resource-records
    :aws.route53/failover
    :aws.route53/region])))
(do
 (clojure.spec.alpha/def
  :aws.route53/cloud-watch-logs-log-group-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/query-logging-config
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/cloud-watch-logs-log-group-arn]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.route53/insufficient-data-health-status
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/search-string
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/failure-threshold
  clojure.core/integer?)
 (clojure.spec.alpha/def :aws.route53/port clojure.core/integer?)
 (clojure.spec.alpha/def :aws.route53/ip-address clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/resource-path
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/enable-sni clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.route53/measure-latency
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.route53/health-threshold
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.route53/request-interval
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.route53/fully-qualified-domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/inverted clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.route53/health-check-config
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/type]
   :opt
   [:aws.route53/insufficient-data-health-status
    :aws.route53/search-string
    :aws.route53/failure-threshold
    :aws.route53/child-health-checks
    :aws.route53/regions
    :aws.route53/port
    :aws.route53/ip-address
    :aws.route53/resource-path
    :aws.route53/alarm-identifier
    :aws.route53/enable-sni
    :aws.route53/measure-latency
    :aws.route53/health-threshold
    :aws.route53/request-interval
    :aws.route53/fully-qualified-domain-name
    :aws.route53/inverted])))
(do
 (clojure.spec.alpha/def :aws.route53/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/region clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/alarm-identifier
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/name :aws.route53/region]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.route53/continent-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/country-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/subdivision-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/geo-location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.route53/continent-code
    :aws.route53/country-code
    :aws.route53/subdivision-code])))
(do
 (clojure.spec.alpha/def :aws.route53/vpc-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.route53/vpc-region clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.route53/vpc
  (clojure.spec.alpha/keys
   :req
   [:aws.route53/vpc-id :aws.route53/vpc-region]
   :opt
   [])))
