(ns aws.certificate-manager
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.certificate-manager/certificate
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.certificate-manager/domain-name]
   :opt
   [:aws.certificate-manager/domain-validation-options
    :aws.certificate-manager/subject-alternative-names
    :aws.certificate-manager/tags]))
 (clojure.spec.alpha/def
  :aws.certificate-manager/domain-name
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :aws.certificate-manager/domain-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.certificate-manager/validation-domain
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.certificate-manager/domain-validation-option
  (clojure.spec.alpha/keys
   :req
   [:aws.certificate-manager/domain-name
    :aws.certificate-manager/validation-domain]
   :opt
   [])))
