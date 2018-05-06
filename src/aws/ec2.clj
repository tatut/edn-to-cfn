(ns aws.ec2
  "AUTOGENERATED clojure.spec definitions"
  (:require [clojure.spec.alpha]))

(clojure.spec.alpha/def
 :aws.ec2/launch-template
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.ec2/launch-template-name :aws.ec2/launch-template-data]))
(clojure.spec.alpha/def
 :aws.ec2/route
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/route-table-id]
  :opt
  [:aws.ec2/instance-id
   :aws.ec2/nat-gateway-id
   :aws.ec2/network-interface-id
   :aws.ec2/destination-ipv6-cidr-block
   :aws.ec2/destination-cidr-block
   :aws.ec2/vpc-peering-connection-id
   :aws.ec2/gateway-id
   :aws.ec2/egress-only-internet-gateway-id]))
(clojure.spec.alpha/def
 :aws.ec2/network-interface-attachment
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/device-index
   :aws.ec2/instance-id
   :aws.ec2/network-interface-id]
  :opt
  [:aws.ec2/delete-on-termination]))
(clojure.spec.alpha/def
 :aws.ec2/dhcp-options
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.ec2/domain-name
   :aws.ec2/domain-name-servers
   :aws.ec2/netbios-name-servers
   :aws.ec2/netbios-node-type
   :aws.ec2/ntp-servers
   :aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/spot-fleet
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/spot-fleet-request-config-data]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/network-acl-entry
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/rule-action
   :aws.ec2/network-acl-id
   :aws.ec2/rule-number
   :aws.ec2/cidr-block
   :aws.ec2/protocol]
  :opt
  [:aws.ec2/egress
   :aws.ec2/icmp
   :aws.ec2/ipv6-cidr-block
   :aws.ec2/port-range]))
(clojure.spec.alpha/def
 :aws.ec2/subnet-route-table-association
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/route-table-id :aws.ec2/subnet-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/vpc-endpoint
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/service-name :aws.ec2/vpc-id]
  :opt
  [:aws.ec2/policy-document :aws.ec2/route-table-ids]))
(clojure.spec.alpha/def
 :aws.ec2/route-table
 (clojure.spec.alpha/keys :req [:aws.ec2/vpc-id] :opt [:aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/subnet-network-acl-association
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/network-acl-id :aws.ec2/subnet-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/network-acl
 (clojure.spec.alpha/keys :req [:aws.ec2/vpc-id] :opt [:aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/vpc-peering-connection
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/peer-vpc-id :aws.ec2/vpc-id]
  :opt
  [:aws.ec2/peer-owner-id :aws.ec2/peer-role-arn :aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/network-interface-permission
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/aws-account-id
   :aws.ec2/network-interface-id
   :aws.ec2/permission]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/vpn-gateway
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/type]
  :opt
  [:aws.ec2/amazon-side-asn :aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/security-group
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/group-description]
  :opt
  [:aws.ec2/group-name
   :aws.ec2/security-group-egress
   :aws.ec2/security-group-ingress
   :aws.ec2/tags
   :aws.ec2/vpc-id]))
(clojure.spec.alpha/def
 :aws.ec2/vpcdhcp-options-association
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/dhcp-options-id :aws.ec2/vpc-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/security-group-egress
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/ip-protocol :aws.ec2/group-id]
  :opt
  [:aws.ec2/to-port
   :aws.ec2/cidr-ipv6
   :aws.ec2/from-port
   :aws.ec2/description
   :aws.ec2/destination-prefix-list-id
   :aws.ec2/destination-security-group-id
   :aws.ec2/cidr-ip]))
(clojure.spec.alpha/def
 :aws.ec2/vpc
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/cidr-block]
  :opt
  [:aws.ec2/enable-dns-hostnames
   :aws.ec2/enable-dns-support
   :aws.ec2/instance-tenancy
   :aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/internet-gateway
 (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/volume-attachment
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/device :aws.ec2/instance-id :aws.ec2/volume-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/customer-gateway
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/bgp-asn :aws.ec2/ip-address :aws.ec2/type]
  :opt
  [:aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/subnet
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/cidr-block :aws.ec2/vpc-id]
  :opt
  [:aws.ec2/assign-ipv6-address-on-creation
   :aws.ec2/availability-zone
   :aws.ec2/ipv6-cidr-block
   :aws.ec2/map-public-ip-on-launch
   :aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/security-group-ingress
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/ip-protocol]
  :opt
  [:aws.ec2/source-security-group-owner-id
   :aws.ec2/to-port
   :aws.ec2/source-security-group-name
   :aws.ec2/cidr-ipv6
   :aws.ec2/group-name
   :aws.ec2/group-id
   :aws.ec2/from-port
   :aws.ec2/description
   :aws.ec2/source-security-group-id
   :aws.ec2/cidr-ip]))
(clojure.spec.alpha/def
 :aws.ec2/placement-group
 (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/strategy]))
(clojure.spec.alpha/def
 :aws.ec2/egress-only-internet-gateway
 (clojure.spec.alpha/keys :req [:aws.ec2/vpc-id] :opt []))
(clojure.spec.alpha/def
 :aws.ec2/vpn-gateway-route-propagation
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/route-table-ids :aws.ec2/vpn-gateway-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/vpn-connection
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/customer-gateway-id :aws.ec2/type :aws.ec2/vpn-gateway-id]
  :opt
  [:aws.ec2/static-routes-only
   :aws.ec2/tags
   :aws.ec2/vpn-tunnel-options-specifications]))
(clojure.spec.alpha/def
 :aws.ec2/vpn-connection-route
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/destination-cidr-block :aws.ec2/vpn-connection-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/instance
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/image-id]
  :opt
  [:aws.ec2/kernel-id
   :aws.ec2/credit-specification
   :aws.ec2/ipv6-addresses
   :aws.ec2/security-group-ids
   :aws.ec2/subnet-id
   :aws.ec2/tenancy
   :aws.ec2/affinity
   :aws.ec2/security-groups
   :aws.ec2/ebs-optimized
   :aws.ec2/instance-type
   :aws.ec2/host-id
   :aws.ec2/tags
   :aws.ec2/source-dest-check
   :aws.ec2/key-name
   :aws.ec2/availability-zone
   :aws.ec2/elastic-gpu-specifications
   :aws.ec2/ssm-associations
   :aws.ec2/additional-info
   :aws.ec2/placement-group-name
   :aws.ec2/disable-api-termination
   :aws.ec2/monitoring
   :aws.ec2/block-device-mappings
   :aws.ec2/ramdisk-id
   :aws.ec2/volumes
   :aws.ec2/user-data
   :aws.ec2/instance-initiated-shutdown-behavior
   :aws.ec2/iam-instance-profile
   :aws.ec2/private-ip-address
   :aws.ec2/network-interfaces
   :aws.ec2/ipv6-address-count]))
(clojure.spec.alpha/def
 :aws.ec2/network-interface
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/subnet-id]
  :opt
  [:aws.ec2/ipv6-addresses
   :aws.ec2/interface-type
   :aws.ec2/group-set
   :aws.ec2/tags
   :aws.ec2/source-dest-check
   :aws.ec2/description
   :aws.ec2/private-ip-addresses
   :aws.ec2/secondary-private-ip-address-count
   :aws.ec2/private-ip-address
   :aws.ec2/ipv6-address-count]))
(clojure.spec.alpha/def
 :aws.ec2/vpc-cidr-block
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/vpc-id]
  :opt
  [:aws.ec2/amazon-provided-ipv6-cidr-block :aws.ec2/cidr-block]))
(clojure.spec.alpha/def
 :aws.ec2/trunk-interface-association
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/branch-interface-id :aws.ec2/trunk-interface-id]
  :opt
  [:aws.ec2/gre-key :aws.ec2/vlan-id]))
(clojure.spec.alpha/def
 :aws.ec2/subnet-cidr-block
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/ipv6-cidr-block :aws.ec2/subnet-id]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/host
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/availability-zone :aws.ec2/instance-type]
  :opt
  [:aws.ec2/auto-placement]))
(clojure.spec.alpha/def
 :aws.ec2/vpc-gateway-attachment
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/vpc-id]
  :opt
  [:aws.ec2/internet-gateway-id :aws.ec2/vpn-gateway-id]))
(clojure.spec.alpha/def
 :aws.ec2/volume
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/availability-zone]
  :opt
  [:aws.ec2/encrypted
   :aws.ec2/tags
   :aws.ec2/kms-key-id
   :aws.ec2/size
   :aws.ec2/iops
   :aws.ec2/auto-enable-io
   :aws.ec2/volume-type
   :aws.ec2/snapshot-id]))
(clojure.spec.alpha/def
 :aws.ec2/flow-log
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/deliver-logs-permission-arn
   :aws.ec2/log-group-name
   :aws.ec2/resource-id
   :aws.ec2/resource-type
   :aws.ec2/traffic-type]
  :opt
  []))
(clojure.spec.alpha/def
 :aws.ec2/eip
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.ec2/domain :aws.ec2/instance-id]))
(clojure.spec.alpha/def
 :aws.ec2/nat-gateway
 (clojure.spec.alpha/keys
  :req
  [:aws.ec2/allocation-id :aws.ec2/subnet-id]
  :opt
  [:aws.ec2/tags]))
(clojure.spec.alpha/def
 :aws.ec2/eip-association
 (clojure.spec.alpha/keys
  :req
  []
  :opt
  [:aws.ec2/allocation-id
   :aws.ec2/eip
   :aws.ec2/instance-id
   :aws.ec2/network-interface-id
   :aws.ec2/private-ip-address]))
(do
 (clojure.spec.alpha/def :aws.ec2/resource-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-fleet-tag-specification
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/resource-type])))
(do
 (clojure.spec.alpha/def :aws.ec2/market-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-market-options
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/spot-options :aws.ec2/market-type])))
(do
 (clojure.spec.alpha/def :aws.ec2/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/elastic-gpu-specification
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/type])))
(do
 (clojure.spec.alpha/def :aws.ec2/arn clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/iam-instance-profile
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/arn :aws.ec2/name])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/encrypted clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/iops clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/snapshot-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/volume-size clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/volume-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ebs
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/delete-on-termination
    :aws.ec2/encrypted
    :aws.ec2/iops
    :aws.ec2/snapshot-id
    :aws.ec2/volume-size
    :aws.ec2/volume-type])))
(do
 (clojure.spec.alpha/def :aws.ec2/primary clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/primary :aws.ec2/private-ip-address]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.ec2/ipv6-address clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-ipv6-address
  (clojure.spec.alpha/keys :req [:aws.ec2/ipv6-address] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/device clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/volume-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/volume
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/device :aws.ec2/volume-id]
   :opt
   [])))
(do
 (clojure.spec.alpha/def :aws.ec2/code clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/type clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/icmp
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/code :aws.ec2/type])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/instance-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/spot-price clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/subnet-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/weighted-capacity
  clojure.core/double?)
 (clojure.spec.alpha/def
  :aws.ec2/launch-template-overrides
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/availability-zone
    :aws.ec2/instance-type
    :aws.ec2/spot-price
    :aws.ec2/subnet-id
    :aws.ec2/weighted-capacity])))
(do
 (clojure.spec.alpha/def :aws.ec2/enabled clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-fleet-monitoring
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/enabled])))
(do
 (clojure.spec.alpha/def :aws.ec2/key clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/association-parameter
  (clojure.spec.alpha/keys :req [:aws.ec2/key :aws.ec2/value] :opt [])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/launch-template-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/launch-template-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/version clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/fleet-launch-template-specification
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/launch-template-id
    :aws.ec2/launch-template-name
    :aws.ec2/version])))
(do
 (clojure.spec.alpha/def :aws.ec2/from clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/to clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/port-range
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/from :aws.ec2/to])))
(do
 (clojure.spec.alpha/def :aws.ec2/kernel-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/image-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/subnet-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/ebs-optimized clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/instance-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/key-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/spot-price clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/weighted-capacity
  clojure.core/double?)
 (clojure.spec.alpha/def :aws.ec2/ramdisk-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/user-data clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-fleet-launch-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/image-id :aws.ec2/instance-type]
   :opt
   [:aws.ec2/tag-specifications
    :aws.ec2/kernel-id
    :aws.ec2/placement
    :aws.ec2/subnet-id
    :aws.ec2/security-groups
    :aws.ec2/ebs-optimized
    :aws.ec2/key-name
    :aws.ec2/spot-price
    :aws.ec2/monitoring
    :aws.ec2/weighted-capacity
    :aws.ec2/block-device-mappings
    :aws.ec2/ramdisk-id
    :aws.ec2/user-data
    :aws.ec2/iam-instance-profile
    :aws.ec2/network-interfaces])))
(do
 (clojure.spec.alpha/def :aws.ec2/cpu-credits clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/credit-specification
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/cpu-credits])))
(do
 (clojure.spec.alpha/def :aws.ec2/cidr-ip clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/cidr-ipv6 clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/destination-prefix-list-id
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/destination-security-group-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/from-port clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/ip-protocol clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/to-port clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/egress
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/ip-protocol]
   :opt
   [:aws.ec2/cidr-ip
    :aws.ec2/cidr-ipv6
    :aws.ec2/description
    :aws.ec2/destination-prefix-list-id
    :aws.ec2/destination-security-group-id
    :aws.ec2/from-port
    :aws.ec2/to-port])))
(do
 (clojure.spec.alpha/def :aws.ec2/enabled clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/monitoring
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/enabled])))
(do
 (clojure.spec.alpha/def :aws.ec2/primary clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/private-ip-address]
   :opt
   [:aws.ec2/primary])))
(do
 (clojure.spec.alpha/def :aws.ec2/document-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ssm-association
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/document-name]
   :opt
   [:aws.ec2/association-parameters])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/launch-template-config
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/launch-template-specification :aws.ec2/overrides])))
(do
 (clojure.spec.alpha/def :aws.ec2/device-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/virtual-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/block-device-mapping
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/device-name]
   :opt
   [:aws.ec2/ebs :aws.ec2/no-device :aws.ec2/virtual-name])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/group-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-placement
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/availability-zone :aws.ec2/group-name])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/associate-public-ip-address
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/subnet-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/network-interface-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/device-index clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/secondary-private-ip-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ipv6-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/network-interface
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/associate-public-ip-address
    :aws.ec2/ipv6-addresses
    :aws.ec2/subnet-id
    :aws.ec2/network-interface-id
    :aws.ec2/device-index
    :aws.ec2/description
    :aws.ec2/groups
    :aws.ec2/delete-on-termination
    :aws.ec2/private-ip-addresses
    :aws.ec2/secondary-private-ip-address-count
    :aws.ec2/private-ip-address
    :aws.ec2/ipv6-address-count])))
(do
 (clojure.spec.alpha/def :aws.ec2/group-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/group-identifier
  (clojure.spec.alpha/keys :req [:aws.ec2/group-id] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/elastic-gpu-specification
  (clojure.spec.alpha/keys :req [:aws.ec2/type] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/ipv6-address clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-ipv6-address
  (clojure.spec.alpha/keys :req [:aws.ec2/ipv6-address] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/kernel-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/image-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/ebs-optimized clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/instance-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/key-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/ram-disk-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/disable-api-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/user-data clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-initiated-shutdown-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/launch-template-data
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/tag-specifications
    :aws.ec2/kernel-id
    :aws.ec2/credit-specification
    :aws.ec2/security-group-ids
    :aws.ec2/image-id
    :aws.ec2/placement
    :aws.ec2/security-groups
    :aws.ec2/ebs-optimized
    :aws.ec2/instance-market-options
    :aws.ec2/instance-type
    :aws.ec2/key-name
    :aws.ec2/elastic-gpu-specifications
    :aws.ec2/ram-disk-id
    :aws.ec2/disable-api-termination
    :aws.ec2/monitoring
    :aws.ec2/block-device-mappings
    :aws.ec2/user-data
    :aws.ec2/instance-initiated-shutdown-behavior
    :aws.ec2/iam-instance-profile
    :aws.ec2/network-interfaces])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/encrypted clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/iops clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/snapshot-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/volume-size clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/volume-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ebs-block-device
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/delete-on-termination
    :aws.ec2/encrypted
    :aws.ec2/iops
    :aws.ec2/snapshot-id
    :aws.ec2/volume-size
    :aws.ec2/volume-type])))
(do
 (clojure.spec.alpha/def :aws.ec2/ipv6-address clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-ipv6-address
  (clojure.spec.alpha/keys :req [:aws.ec2/ipv6-address] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/ipv6-address clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ipv6-add
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/ipv6-address])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/source-security-group-owner-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/to-port clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/source-security-group-name
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/ip-protocol clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/cidr-ipv6 clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/from-port clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/source-security-group-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/cidr-ip clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ingress
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/ip-protocol]
   :opt
   [:aws.ec2/source-security-group-owner-id
    :aws.ec2/to-port
    :aws.ec2/source-security-group-name
    :aws.ec2/cidr-ipv6
    :aws.ec2/from-port
    :aws.ec2/description
    :aws.ec2/source-security-group-id
    :aws.ec2/cidr-ip])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/associate-public-ip-address
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/subnet-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/network-interface-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/device-index clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/secondary-private-ip-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/ipv6-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/network-interface
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/device-index]
   :opt
   [:aws.ec2/associate-public-ip-address
    :aws.ec2/ipv6-addresses
    :aws.ec2/subnet-id
    :aws.ec2/group-set
    :aws.ec2/network-interface-id
    :aws.ec2/description
    :aws.ec2/delete-on-termination
    :aws.ec2/private-ip-addresses
    :aws.ec2/secondary-private-ip-address-count
    :aws.ec2/private-ip-address
    :aws.ec2/ipv6-address-count])))
(do
 (clojure.spec.alpha/def :aws.ec2/group-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/tenancy clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/availability-zone
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/affinity clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/host-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/placement
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/group-name
    :aws.ec2/tenancy
    :aws.ec2/availability-zone
    :aws.ec2/affinity
    :aws.ec2/host-id])))
(do
 (clojure.spec.alpha/def :aws.ec2/device-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/no-device clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/virtual-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/block-device-mapping
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/device-name]
   :opt
   [:aws.ec2/ebs :aws.ec2/no-device :aws.ec2/virtual-name])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/associate-public-ip-address
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/subnet-id clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/network-interface-id
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/device-index clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/description clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/secondary-private-ip-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/ipv6-address-count
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-network-interface-specification
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/associate-public-ip-address
    :aws.ec2/ipv6-addresses
    :aws.ec2/subnet-id
    :aws.ec2/network-interface-id
    :aws.ec2/device-index
    :aws.ec2/description
    :aws.ec2/groups
    :aws.ec2/delete-on-termination
    :aws.ec2/private-ip-addresses
    :aws.ec2/secondary-private-ip-address-count
    :aws.ec2/ipv6-address-count])))
(do
 (clojure.spec.alpha/def :aws.ec2/arn clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/iam-instance-profile-specification
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/arn])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/no-device
  (clojure.spec.alpha/keys :req [] :opt [])))
(do
 (clojure.spec.alpha/def :aws.ec2/resource-type clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/tag-specification
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/resource-type :aws.ec2/tags])))
(do
 (clojure.spec.alpha/def :aws.ec2/pre-shared-key clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/tunnel-inside-cidr
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/vpn-tunnel-options-specification
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/pre-shared-key :aws.ec2/tunnel-inside-cidr])))
(do
 (clojure.spec.alpha/def :aws.ec2/primary clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address-specification
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/primary :aws.ec2/private-ip-address]
   :opt
   [])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-address
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/primary clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/private-ip-add
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/private-ip-address :aws.ec2/primary])))
(do
 (clojure.spec.alpha/def :aws.ec2/type clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/valid-from clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/excess-capacity-termination-policy
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/spot-price clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/allocation-strategy
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/iam-fleet-role clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/target-capacity
  clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/terminate-instances-with-expiration
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/replace-unhealthy-instances
  clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/valid-until clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-fleet-request-config-data
  (clojure.spec.alpha/keys
   :req
   [:aws.ec2/iam-fleet-role :aws.ec2/target-capacity]
   :opt
   [:aws.ec2/type
    :aws.ec2/valid-from
    :aws.ec2/excess-capacity-termination-policy
    :aws.ec2/spot-price
    :aws.ec2/allocation-strategy
    :aws.ec2/launch-template-configs
    :aws.ec2/terminate-instances-with-expiration
    :aws.ec2/launch-specifications
    :aws.ec2/replace-unhealthy-instances
    :aws.ec2/valid-until])))
(do
 (clojure.spec.alpha/def
  :aws.ec2/spot-instance-type
  clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/instance-interruption-behavior
  clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/max-price clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/spot-options
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/spot-instance-type
    :aws.ec2/instance-interruption-behavior
    :aws.ec2/max-price])))
(do
 (clojure.spec.alpha/def :aws.ec2/cpu-credits clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/credit-specification
  (clojure.spec.alpha/keys :req [] :opt [:aws.ec2/cpu-credits])))
(do
 (clojure.spec.alpha/def :aws.ec2/snapshot-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/volume-type clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/kms-key-id clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/encrypted clojure.core/boolean?)
 (clojure.spec.alpha/def :aws.ec2/iops clojure.core/integer?)
 (clojure.spec.alpha/def :aws.ec2/volume-size clojure.core/integer?)
 (clojure.spec.alpha/def
  :aws.ec2/delete-on-termination
  clojure.core/boolean?)
 (clojure.spec.alpha/def
  :aws.ec2/ebs
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/snapshot-id
    :aws.ec2/volume-type
    :aws.ec2/kms-key-id
    :aws.ec2/encrypted
    :aws.ec2/iops
    :aws.ec2/volume-size
    :aws.ec2/delete-on-termination])))
(do
 (clojure.spec.alpha/def :aws.ec2/no-device clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/virtual-name clojure.core/string?)
 (clojure.spec.alpha/def :aws.ec2/device-name clojure.core/string?)
 (clojure.spec.alpha/def
  :aws.ec2/block-device-mapping
  (clojure.spec.alpha/keys
   :req
   []
   :opt
   [:aws.ec2/ebs
    :aws.ec2/no-device
    :aws.ec2/virtual-name
    :aws.ec2/device-name])))