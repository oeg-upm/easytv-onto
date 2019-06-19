sbtPlugin := false

name := "easytv-onto"

description := "Workflow for producing derived artifacts from source ontology specifications"

moduleName := name.value

organization := "easytv-onto"

organizationName := "JPL-IMCE"

homepage := Some(url(s"https://github.com/mariapoveda/${moduleName.value}"))

organizationHomepage := Some(url("https://github.com/mariapoveda"))

git.remoteRepo := "git@github.jpl.nasa.gov/imce/gov.nasa.jpl.imce.ontologies.workflow.git"

// publish to bintray.com via: `sbt publish`
publishTo := Some(
  "JPL-IMCE" at
    s"https://api.bintray.com/content/jpl-imce/${organization.value}/${moduleName.value}/${version.value}")

scmInfo := Some(ScmInfo(
  browseUrl = url(s"https://github.com/mariapoveda/easytv-onto"),
  connection = "scm:"+git.remoteRepo.value))

developers := List(
  Developer(
    id="sherzig",
    name="Hamza Malik",
    email="hamzamalik94@gmail.com",
    url=url("https://github.com/mariapoveda/easytv-onto")))