(ns aws.dynamo-db
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.dynamo-db/table
 (clojure.spec.alpha/keys
  :req
  [:aws.dynamo-db/key-schema :aws.dynamo-db/provisioned-throughput]
  :opt
  [:aws.dynamo-db/stream-specification
   :aws.dynamo-db/time-to-live-specification
   :aws.dynamo-db/attribute-definitions
   :aws.dynamo-db/tags
   :aws.dynamo-db/local-secondary-indexes
   :aws.dynamo-db/sse-specification
   :aws.dynamo-db/table-name
   :aws.dynamo-db/global-secondary-indexes]))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/index-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/global-secondary-index
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/index-name
    :aws.dynamo-db/key-schema
    :aws.dynamo-db/projection
    :aws.dynamo-db/provisioned-throughput]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/index-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/local-secondary-index
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/index-name
    :aws.dynamo-db/key-schema
    :aws.dynamo-db/projection]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/attribute-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/attribute-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/attribute-definition
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/attribute-name :aws.dynamo-db/attribute-type]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/read-capacity-units
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/write-capacity-units
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/provisioned-throughput
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/read-capacity-units
    :aws.dynamo-db/write-capacity-units]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/attribute-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.dynamo-db/key-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/key-schema
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/attribute-name :aws.dynamo-db/key-type]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/attribute-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.dynamo-db/enabled clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/time-to-live-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/attribute-name :aws.dynamo-db/enabled]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/projection-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/projection
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.dynamo-db/non-key-attributes :aws.dynamo-db/projection-type])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/sse-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/sse-specification
  (clojure.spec.alpha/keys :req [:aws.dynamo-db/sse-enabled] :opt [])))
(do
 (clojure.spec.alpha/def
  :aws.dynamo-db/stream-view-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.dynamo-db/stream-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.dynamo-db/stream-view-type]
   :opt
   [])))