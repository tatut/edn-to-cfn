(ns aws.api-gateway
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.api-gateway/request-validator
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/name
   :aws.api-gateway/validate-request-body
   :aws.api-gateway/validate-request-parameters]))
(clojure.spec.alpha/def
 :aws.api-gateway/model
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/content-type
   :aws.api-gateway/description
   :aws.api-gateway/name
   :aws.api-gateway/schema]))
(clojure.spec.alpha/def
 :aws.api-gateway/account
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.api-gateway/cloud-watch-role-arn]))
(clojure.spec.alpha/def
 :aws.api-gateway/documentation-part
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/location
   :aws.api-gateway/properties
   :aws.api-gateway/rest-api-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.api-gateway/method
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/resource-id
   :aws.api-gateway/http-method
   :aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/api-key-required
   :aws.api-gateway/operation-name
   :aws.api-gateway/request-models
   :aws.api-gateway/request-parameters
   :aws.api-gateway/authorizer-id
   :aws.api-gateway/authorization-type
   :aws.api-gateway/request-validator-id
   :aws.api-gateway/method-responses
   :aws.api-gateway/integration]))
(clojure.spec.alpha/def
 :aws.api-gateway/client-certificate
 (clojure.spec.alpha/keys :req [] :opt [:aws.api-gateway/description]))
(clojure.spec.alpha/def
 :aws.api-gateway/deployment
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/description
   :aws.api-gateway/stage-description
   :aws.api-gateway/stage-name]))
(clojure.spec.alpha/def
 :aws.api-gateway/base-path-mapping
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/domain-name]
  :opt
  [:aws.api-gateway/base-path
   :aws.api-gateway/rest-api-id
   :aws.api-gateway/stage]))
(clojure.spec.alpha/def
 :aws.api-gateway/usage-plan-key
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/key-id
   :aws.api-gateway/key-type
   :aws.api-gateway/usage-plan-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.api-gateway/resource
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/parent-id
   :aws.api-gateway/path-part
   :aws.api-gateway/rest-api-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.api-gateway/usage-plan
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.api-gateway/api-stages
   :aws.api-gateway/description
   :aws.api-gateway/quota
   :aws.api-gateway/throttle
   :aws.api-gateway/usage-plan-name]))
(clojure.spec.alpha/def
 :aws.api-gateway/authorizer
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/type
   :aws.api-gateway/identity-validation-expression
   :aws.api-gateway/authorizer-credentials
   :aws.api-gateway/identity-source
   :aws.api-gateway/provider-ar-ns
   :aws.api-gateway/authorizer-result-ttl-in-seconds
   :aws.api-gateway/auth-type
   :aws.api-gateway/name
   :aws.api-gateway/authorizer-uri]))
(clojure.spec.alpha/def
 :aws.api-gateway/stage
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/variables
   :aws.api-gateway/client-certificate-id
   :aws.api-gateway/cache-cluster-size
   :aws.api-gateway/cache-cluster-enabled
   :aws.api-gateway/description
   :aws.api-gateway/deployment-id
   :aws.api-gateway/method-settings
   :aws.api-gateway/stage-name
   :aws.api-gateway/documentation-version]))
(clojure.spec.alpha/def
 :aws.api-gateway/rest-api
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.api-gateway/body
   :aws.api-gateway/parameters
   :aws.api-gateway/clone-from
   :aws.api-gateway/body-s3-location
   :aws.api-gateway/api-key-source-type
   :aws.api-gateway/description
   :aws.api-gateway/binary-media-types
   :aws.api-gateway/fail-on-warnings
   :aws.api-gateway/name
   :aws.api-gateway/minimum-compression-size
   :aws.api-gateway/endpoint-configuration]))
(clojure.spec.alpha/def
 :aws.api-gateway/documentation-version
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/documentation-version :aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/description]))
(clojure.spec.alpha/def
 :aws.api-gateway/api-key
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.api-gateway/customer-id
   :aws.api-gateway/description
   :aws.api-gateway/enabled
   :aws.api-gateway/generate-distinct-id
   :aws.api-gateway/name
   :aws.api-gateway/stage-keys]))
(clojure.spec.alpha/def
 :aws.api-gateway/gateway-response
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/response-type :aws.api-gateway/rest-api-id]
  :opt
  [:aws.api-gateway/response-parameters
   :aws.api-gateway/response-templates
   :aws.api-gateway/status-code]))
(clojure.spec.alpha/def
 :aws.api-gateway/domain-name
 (clojure.spec.alpha/keys
  :req
  [:aws.api-gateway/domain-name]
  :opt
  [:aws.api-gateway/certificate-arn
   :aws.api-gateway/endpoint-configuration
   :aws.api-gateway/regional-certificate-arn]))
(do
 (clojure.spec.alpha/def :aws.api-gateway/method clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/name clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/path clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/method
    :aws.api-gateway/name
    :aws.api-gateway/path
    :aws.api-gateway/status-code
    :aws.api-gateway/type])))
(do
 (clojure.spec.alpha/def :aws.api-gateway/api-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/stage clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/api-stage
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/api-id :aws.api-gateway/stage])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/rest-api-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/stage-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/stage-key
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/rest-api-id :aws.api-gateway/stage-name])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/endpoint-configuration
  (clojure.spec.alpha/keys :req [] :opt [:aws.api-gateway/types])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttle-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/burst-limit :aws.api-gateway/rate-limit])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/method-response
  (clojure.spec.alpha/keys
   :req
   [:aws.api-gateway/status-code]
   :opt
   [:aws.api-gateway/response-models
    :aws.api-gateway/response-parameters])))
(do
 (clojure.spec.alpha/def :aws.api-gateway/limit clojure.core/integer?)
 (clojure.spec.alpha/def :aws.api-gateway/offset clojure.core/integer?)
 (clojure.spec.alpha/def :aws.api-gateway/period clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/quota-settings
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/limit
    :aws.api-gateway/offset
    :aws.api-gateway/period])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/endpoint-configuration
  (clojure.spec.alpha/keys :req [] :opt [:aws.api-gateway/types])))
(do
 (clojure.spec.alpha/def :aws.api-gateway/uri clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-namespace
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/content-handling
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/passthrough-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/credentials
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/integration-http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/integration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/request-templates
    :aws.api-gateway/uri
    :aws.api-gateway/cache-namespace
    :aws.api-gateway/type
    :aws.api-gateway/request-parameters
    :aws.api-gateway/content-handling
    :aws.api-gateway/passthrough-behavior
    :aws.api-gateway/cache-key-parameters
    :aws.api-gateway/integration-responses
    :aws.api-gateway/credentials
    :aws.api-gateway/integration-http-method])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/resource-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/method-setting
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/caching-enabled
    :aws.api-gateway/cache-ttl-in-seconds
    :aws.api-gateway/metrics-enabled
    :aws.api-gateway/throttling-burst-limit
    :aws.api-gateway/data-trace-enabled
    :aws.api-gateway/resource-path
    :aws.api-gateway/http-method
    :aws.api-gateway/cache-data-encrypted
    :aws.api-gateway/throttling-rate-limit
    :aws.api-gateway/logging-level])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/resource-path
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/http-method
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/method-setting
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/caching-enabled
    :aws.api-gateway/cache-ttl-in-seconds
    :aws.api-gateway/metrics-enabled
    :aws.api-gateway/throttling-burst-limit
    :aws.api-gateway/data-trace-enabled
    :aws.api-gateway/resource-path
    :aws.api-gateway/http-method
    :aws.api-gateway/cache-data-encrypted
    :aws.api-gateway/throttling-rate-limit
    :aws.api-gateway/logging-level])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/content-handling
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/selection-pattern
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/status-code
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/integration-response
  (clojure.spec.alpha/keys
   :req
   [:aws.api-gateway/status-code]
   :opt
   [:aws.api-gateway/content-handling
    :aws.api-gateway/response-parameters
    :aws.api-gateway/response-templates
    :aws.api-gateway/selection-pattern])))
(do
 (clojure.spec.alpha/def :aws.api-gateway/bucket clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/e-tag clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/key clojure.core/string?)
 (clojure.spec.alpha/def :aws.api-gateway/version clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/s3-location
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/bucket
    :aws.api-gateway/e-tag
    :aws.api-gateway/key
    :aws.api-gateway/version])))
(do
 (clojure.spec.alpha/def
  :aws.api-gateway/caching-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-ttl-in-seconds
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/client-certificate-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/metrics-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-burst-limit
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-cluster-size
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-cluster-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/description
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/data-trace-enabled
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/cache-data-encrypted
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.api-gateway/throttling-rate-limit
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.api-gateway/logging-level
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/documentation-version
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.api-gateway/stage-description
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.api-gateway/caching-enabled
    :aws.api-gateway/variables
    :aws.api-gateway/cache-ttl-in-seconds
    :aws.api-gateway/client-certificate-id
    :aws.api-gateway/metrics-enabled
    :aws.api-gateway/throttling-burst-limit
    :aws.api-gateway/cache-cluster-size
    :aws.api-gateway/cache-cluster-enabled
    :aws.api-gateway/description
    :aws.api-gateway/data-trace-enabled
    :aws.api-gateway/cache-data-encrypted
    :aws.api-gateway/method-settings
    :aws.api-gateway/throttling-rate-limit
    :aws.api-gateway/logging-level
    :aws.api-gateway/documentation-version])))