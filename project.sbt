sbtPlugin := false

name := "gov.nasa.jpl.imce.ontologies.workflow"

description := "Workflow for producing derived artifacts from source ontology specifications"

moduleName := name.value

organization := "gov.nasa.jpl.imce"

organizationName := "JPL-IMCE"

homepage := Some(url(s"https://github.jpl.nasa.gov/imce/${moduleName.value}"))

organizationHomepage := Some(url("https://github.jpl.nasa.gov/imce"))

git.remoteRepo := "git@github.jpl.nasa.gov/imce/gov.nasa.jpl.imce.ontologies.workflow.git"

// publish to bintray.com via: `sbt publish`
publishTo := Some(
  "JPL-IMCE" at
    s"https://api.bintray.com/content/jpl-imce/${organization.value}/${moduleName.value}/${version.value}")

scmInfo := Some(ScmInfo(
  browseUrl = url(s"https://github.jpl.nasa.gov/imce/gov.nasa.jpl.imce.ontologies.workflow"),
  connection = "scm:"+git.remoteRepo.value))

developers := List(
  Developer(
    id="sherzig",
    name="Hamza Malik",
    email="hamzamalik94@gmail.com",
    url=url("https://github.com/mariapoveda/easytv-onto")))