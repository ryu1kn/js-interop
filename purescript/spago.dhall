{ name = "my-project"
, dependencies = [ "console", "effect", "psci-support", "aff-promise" ]
, packages = ./packages.dhall
, sources = [ "src/**/*.purs", "test/**/*.purs" ]
}
