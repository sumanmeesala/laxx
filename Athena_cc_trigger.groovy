import jenkins.model.Jenkins
import hudson.model.listView

Jenkins jenkins = Jenkins.getInstance()

def viewName = 'Athena'
jenkins.addView(new ListView(viewName))



job('Athena_cc_trigger') {
    description('This is an Athena_cc_trigger Job DSL job')
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im Athena_cc_trigger"')
    }
        publishers {
              downstream('ou_substitution_builder_main_athena')
                   }
}


myView = hudson.model.Hudson.instance.getView(viewName)
myView.doAddJobToView('Athena_cc_trigger')
jenkins.save()
