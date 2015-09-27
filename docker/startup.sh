#!/usr/bin/env bash

sh docker/server/run-package.sh
sh docker/server/run-gf.sh


sh docker/client/run-package.sh
sh docker/client/run-gf.sh