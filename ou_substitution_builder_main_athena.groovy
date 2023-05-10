matrixJob('ou_substitution_builder_main_athena') {
    description('This is an ou_substitution_builder_main_athena Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im ou_substitution_builder_main_athena"')
    }
            publishers {
              downstream('course_lineage_athena_builder_main')
              downstream('org_unit_hierarchy_builder_main_athena_corpwise')
                   }
    myView = hudson.model.Hudson.instance.getView(viewName)
myView.doAddJobToView('Athena_cc_trigger')
jenkins.save()
}
