# scala-workbench.g8

* [WIP] - Still some bugs, but the ordering of template input is somewhat funny, the maven(..deps) macro doesn't seem to work for downloading the latest dependency versioning

Simple project setup for easy access to scala workbench for prototyping, i.e. with following libraries:

* Specs2 
* sourcecode 
* pprint
* fastparse
* cats
* fs-core
* fs-io
* better-files

To test this template out:

```bash
sbt new scalavision/scala-workbench.g8
```

To clone this repo and test it out locally:

```bash
git clone https://github.com/scalavision/scala-workbench.g8
mkdir MyGitter8Test
cd MyGitter8Test
g8 file://../scala-workbench.g8
# The output of the scala workbench project should now be in standing directory
```

----------------------------------------------------------------------------------------------------------

Written in 2017 by scalavision

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
