#!/bin/bash

while [ ! $# -eq 0 ]
do
    case "$1" in
        --orgs)
            shift
            orgs="$1"
            ;;
        esac
        shift
done

echo "$orgs"

if [[ ${orgs[*]} =~ $"POC" ]]; then
    echo "$orgs"
fi
