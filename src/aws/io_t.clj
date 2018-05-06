(ns aws.io-t
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.io-t/thing
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.io-t/attribute-payload :aws.io-t/thing-name]))
(clojure.spec.alpha/def
 :aws.io-t/policy-principal-attachment
 (clojure.spec.alpha/keys
  :req
  [:aws.io-t/policy-name :aws.io-t/principal]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.io-t/certificate
 (clojure.spec.alpha/keys
  :req
  [:aws.io-t/certificate-signing-request :aws.io-t/status]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.io-t/thing-principal-attachment
 (clojure.spec.alpha/keys
  :req
  [:aws.io-t/principal :aws.io-t/thing-name]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.io-t/policy
 (clojure.spec.alpha/keys
  :req
  [:aws.io-t/policy-document]
  :opt
  [:aws.io-t/policy-name]))
(clojure.spec.alpha/def
 :aws.io-t/topic-rule
 (clojure.spec.alpha/keys
  :req
  [:aws.io-t/topic-rule-payload]
  :opt
  [:aws.io-t/rule-name]))
(do
 (clojure.spec.alpha/def :aws.io-t/endpoint clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/id clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/index clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/elasticsearch-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/endpoint
    :aws.io-t/id
    :aws.io-t/index
    :aws.io-t/role-arn
    :aws.io-t/type]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.io-t/function-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/lambda-action
  (clojure.spec.alpha/keys :req [] :opt [:aws.io-t/function-arn])))
(do
 (clojure.spec.alpha/def :aws.io-t/bucket-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/key clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/s3-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/bucket-name :aws.io-t/key :aws.io-t/role-arn]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.io-t/table-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/put-item-input
  (clojure.spec.alpha/keys :req [:aws.io-t/table-name] :opt [])))
(do
 (clojure.spec.alpha/def
  :aws.io-t/action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.io-t/cloudwatch-metric
    :aws.io-t/republish
    :aws.io-t/firehose
    :aws.io-t/cloudwatch-alarm
    :aws.io-t/sqs
    :aws.io-t/dynamo-d-bv2
    :aws.io-t/sns
    :aws.io-t/elasticsearch
    :aws.io-t/lambda
    :aws.io-t/kinesis
    :aws.io-t/dynamo-db
    :aws.io-t/s3])))
(do
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/topic clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/republish-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/role-arn :aws.io-t/topic]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.io-t/delivery-stream-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/separator clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/firehose-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/delivery-stream-name :aws.io-t/role-arn]
   :opt
   [:aws.io-t/separator])))
(do
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/dynamo-d-bv2-action
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.io-t/put-item :aws.io-t/role-arn])))
(do
 (clojure.spec.alpha/def
  :aws.io-t/attribute-payload
  (clojure.spec.alpha/keys :req [] :opt [:aws.io-t/attributes])))
(do
 (clojure.spec.alpha/def :aws.io-t/alarm-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/state-reason clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/state-value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/cloudwatch-alarm-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/alarm-name
    :aws.io-t/role-arn
    :aws.io-t/state-reason
    :aws.io-t/state-value]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.io-t/partition-key clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/stream-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/kinesis-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/role-arn :aws.io-t/stream-name]
   :opt
   [:aws.io-t/partition-key])))
(do
 (clojure.spec.alpha/def :aws.io-t/queue-url clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/use-base64 clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.io-t/sqs-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/queue-url :aws.io-t/role-arn]
   :opt
   [:aws.io-t/use-base64])))
(do
 (clojure.spec.alpha/def :aws.io-t/metric-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/metric-namespace
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/metric-timestamp
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/metric-unit clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/metric-value clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/cloudwatch-metric-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/metric-name
    :aws.io-t/metric-namespace
    :aws.io-t/metric-unit
    :aws.io-t/metric-value
    :aws.io-t/role-arn]
   :opt
   [:aws.io-t/metric-timestamp])))
(do
 (clojure.spec.alpha/def :aws.io-t/message-format clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/target-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/sns-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/role-arn :aws.io-t/target-arn]
   :opt
   [:aws.io-t/message-format])))
(do
 (clojure.spec.alpha/def
  :aws.io-t/aws-iot-sql-version
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/description clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/rule-disabled clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.io-t/sql clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/topic-rule-payload
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/actions :aws.io-t/rule-disabled :aws.io-t/sql]
   :opt
   [:aws.io-t/aws-iot-sql-version :aws.io-t/description])))
(do
 (clojure.spec.alpha/def
  :aws.io-t/range-key-field
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/hash-key-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/range-key-value
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/hash-key-value clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/range-key-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/hash-key-field clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/table-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.io-t/payload-field clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.io-t/dynamo-db-action
  (clojure.spec.alpha/keys
   :req
   [:aws.io-t/role-arn
    :aws.io-t/hash-key-value
    :aws.io-t/hash-key-field
    :aws.io-t/table-name]
   :opt
   [:aws.io-t/range-key-field
    :aws.io-t/hash-key-type
    :aws.io-t/range-key-value
    :aws.io-t/range-key-type
    :aws.io-t/payload-field])))