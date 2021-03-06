(ns aws.cognito
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]
            [edn-to-cfn.specs.cfn :as cfn-specs]))

(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/user-pool-group
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/user-pool-id]
   :opt
   [:aws.cognito/group-name
    :aws.cognito/description
    :aws.cognito/precedence
    :aws.cognito/role-arn]))
 (clojure.spec.alpha/def :aws.cognito/group-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/user-pool-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/precedence clojure.core/double?)
 (clojure.spec.alpha/def :aws.cognito/role-arn clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/identity-pool
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/allow-unauthenticated-identities]
   :opt
   [:aws.cognito/push-sync
    :aws.cognito/supported-login-providers
    :aws.cognito/developer-provider-name
    :aws.cognito/cognito-streams
    :aws.cognito/open-id-connect-provider-ar-ns
    :aws.cognito/identity-pool-name
    :aws.cognito/cognito-identity-providers
    :aws.cognito/saml-provider-ar-ns
    :aws.cognito/cognito-events]))
 (clojure.spec.alpha/def
  :aws.cognito/supported-login-providers
  clojure.core/any?)
 (clojure.spec.alpha/def
  :aws.cognito/developer-provider-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/allow-unauthenticated-identities
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/identity-pool-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/cognito-events clojure.core/any?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/user-pool-user
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/user-pool-id]
   :opt
   [:aws.cognito/validation-data
    :aws.cognito/username
    :aws.cognito/message-action
    :aws.cognito/desired-delivery-mediums
    :aws.cognito/force-alias-creation
    :aws.cognito/user-attributes]))
 (clojure.spec.alpha/def
  :aws.cognito/user-pool-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/username clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/message-action
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/force-alias-creation
  clojure.core/boolean?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/user-pool-client
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/user-pool-id]
   :opt
   [:aws.cognito/generate-secret
    :aws.cognito/client-name
    :aws.cognito/explicit-auth-flows
    :aws.cognito/refresh-token-validity
    :aws.cognito/read-attributes
    :aws.cognito/write-attributes]))
 (clojure.spec.alpha/def
  :aws.cognito/generate-secret
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.cognito/client-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/user-pool-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/refresh-token-validity
  clojure.core/double?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/identity-pool-role-attachment
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/identity-pool-id]
   :opt
   [:aws.cognito/role-mappings :aws.cognito/roles]))
 (clojure.spec.alpha/def :aws.cognito/role-mappings clojure.core/any?)
 (clojure.spec.alpha/def
  :aws.cognito/identity-pool-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/roles clojure.core/any?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/user-pool-user-to-group-attachment
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/group-name
    :aws.cognito/user-pool-id
    :aws.cognito/username]
   :opt
   []))
 (clojure.spec.alpha/def :aws.cognito/group-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/user-pool-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/username clojure.core/string?))
(do
 (clojure.core/defmethod
  cfn-specs/resource-type-spec
  :aws.cognito/user-pool
  [___16342__auto__]
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/sms-configuration
    :aws.cognito/schema
    :aws.cognito/mfa-configuration
    :aws.cognito/admin-create-user-config
    :aws.cognito/sms-verification-message
    :aws.cognito/user-pool-name
    :aws.cognito/username-attributes
    :aws.cognito/email-verification-message
    :aws.cognito/auto-verified-attributes
    :aws.cognito/device-configuration
    :aws.cognito/lambda-config
    :aws.cognito/policies
    :aws.cognito/email-verification-subject
    :aws.cognito/user-pool-tags
    :aws.cognito/email-configuration
    :aws.cognito/sms-authentication-message
    :aws.cognito/alias-attributes]))
 (clojure.spec.alpha/def
  :aws.cognito/mfa-configuration
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/sms-verification-message
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/user-pool-name
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/email-verification-message
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/email-verification-subject
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/user-pool-tags clojure.core/any?)
 (clojure.spec.alpha/def
  :aws.cognito/sms-authentication-message
  clojure.core/string?))
(do
 (clojure.spec.alpha/def
  :aws.cognito/device-only-remembered-on-user-prompt
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/challenge-required-on-new-device
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/device-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/device-only-remembered-on-user-prompt
    :aws.cognito/challenge-required-on-new-device])))
(do
 (clojure.spec.alpha/def :aws.cognito/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/ambiguous-role-resolution
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/role-mapping
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/type]
   :opt
   [:aws.cognito/ambiguous-role-resolution
    :aws.cognito/rules-configuration])))
(do
 (clojure.spec.alpha/def :aws.cognito/value clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/attribute-type
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/value :aws.cognito/name])))
(do
 (clojure.spec.alpha/def :aws.cognito/match-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/value clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/claim clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/mapping-rule
  (clojure.spec.alpha/keys
   :req
   [:aws.cognito/match-type
    :aws.cognito/value
    :aws.cognito/claim
    :aws.cognito/role-arn]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.cognito/min-length clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/max-length clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/string-attribute-constraints
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/min-length :aws.cognito/max-length])))
(do
 (clojure.spec.alpha/def :aws.cognito/external-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/sns-caller-arn
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/sms-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/external-id :aws.cognito/sns-caller-arn])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/server-side-token-check
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/provider-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/client-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/cognito-identity-provider
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/server-side-token-check
    :aws.cognito/provider-name
    :aws.cognito/client-id])))
(do
 (clojure.spec.alpha/def :aws.cognito/min-value clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/max-value clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/number-attribute-constraints
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/min-value :aws.cognito/max-value])))
(do
 (clojure.spec.alpha/def :aws.cognito/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/push-sync
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/application-arns :aws.cognito/role-arn])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/rules-configuration-type
  (clojure.spec.alpha/keys :req [:aws.cognito/rules] :opt [])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/require-numbers
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/minimum-length
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.cognito/require-uppercase
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/require-lowercase
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/require-symbols
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/password-policy
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/require-numbers
    :aws.cognito/minimum-length
    :aws.cognito/require-uppercase
    :aws.cognito/require-lowercase
    :aws.cognito/require-symbols])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/policies
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/password-policy])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/developer-only-attribute
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.cognito/mutable clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/attribute-data-type
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/required clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.cognito/name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/schema-attribute
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/developer-only-attribute
    :aws.cognito/mutable
    :aws.cognito/attribute-data-type
    :aws.cognito/string-attribute-constraints
    :aws.cognito/required
    :aws.cognito/number-attribute-constraints
    :aws.cognito/name])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/email-message
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/sms-message clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/email-subject
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/invite-message-template
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/email-message
    :aws.cognito/sms-message
    :aws.cognito/email-subject])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/create-auth-challenge
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/pre-authentication
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/define-auth-challenge
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/pre-sign-up clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/post-authentication
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/post-confirmation
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/custom-message
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/verify-auth-challenge-response
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/lambda-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/create-auth-challenge
    :aws.cognito/pre-authentication
    :aws.cognito/define-auth-challenge
    :aws.cognito/pre-sign-up
    :aws.cognito/post-authentication
    :aws.cognito/post-confirmation
    :aws.cognito/custom-message
    :aws.cognito/verify-auth-challenge-response])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/streaming-status
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/stream-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/role-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/cognito-streams
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/streaming-status
    :aws.cognito/stream-name
    :aws.cognito/role-arn])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/unused-account-validity-days
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.cognito/allow-admin-create-user-only
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.cognito/admin-create-user-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/invite-message-template
    :aws.cognito/unused-account-validity-days
    :aws.cognito/allow-admin-create-user-only])))
(do
 (clojure.spec.alpha/def
  :aws.cognito/reply-to-email-address
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.cognito/source-arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.cognito/email-configuration
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.cognito/reply-to-email-address :aws.cognito/source-arn])))
