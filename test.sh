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

if [[ ${orgs[*]} =~ $"One" ]]; then
    echo "$orgs"
fi
