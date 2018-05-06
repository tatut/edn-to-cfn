(ns aws.events
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.events/rule
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.events/description
   :aws.events/event-pattern
   :aws.events/name
   :aws.events/role-arn
   :aws.events/schedule-expression
   :aws.events/state
   :aws.events/targets]))
(do
 (clojure.spec.alpha/def
  :aws.events/input-template
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.events/input-transformer
  (clojure.spec.alpha/keys
   :req
   [:aws.events/input-template]
   :opt
   [:aws.events/input-paths-map])))
(do
 (clojure.spec.alpha/def
  :aws.events/run-command-parameters
  (clojure.spec.alpha/keys
   :req
   [:aws.events/run-command-targets]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.events/input-path clojure.core/string?)
 (clojure.spec.alpha/def :aws.events/role-arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.events/input clojure.core/string?)
 (clojure.spec.alpha/def :aws.events/arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.events/id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.events/target
  (clojure.spec.alpha/keys
   :req
   [:aws.events/arn :aws.events/id]
   :opt
   [:aws.events/input-transformer
    :aws.events/input-path
    :aws.events/kinesis-parameters
    :aws.events/role-arn
    :aws.events/input
    :aws.events/run-command-parameters
    :aws.events/ecs-parameters])))
(do
 (clojure.spec.alpha/def :aws.events/task-count clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.events/task-definition-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.events/ecs-parameters
  (clojure.spec.alpha/keys
   :req
   [:aws.events/task-definition-arn]
   :opt
   [:aws.events/task-count])))
(do
 (clojure.spec.alpha/def
  :aws.events/partition-key-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.events/kinesis-parameters
  (clojure.spec.alpha/keys
   :req
   [:aws.events/partition-key-path]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.events/key clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.events/run-command-target
  (clojure.spec.alpha/keys
   :req
   [:aws.events/key :aws.events/values]
   :opt
   [])))