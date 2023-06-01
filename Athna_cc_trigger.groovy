package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()

def viewName = 'Athna'
// jenkins.addView (new ListView(viewName))

def existingView = Jenkins.instance.getView(viewName)
if (existingView == null) {
    // View doesn't exist, create it
    // def newView = 'Athna'
    jenkins.addView (new ListView(viewName))
   // newView.save()
}


job('Athna_cc_trigger') {
    description('This is an Athna_cc_trigger Job DSL job')


    steps {
        shell('echo "Im Athna_cc_trigger - modified"')
    }
        publishers {
              downstream('ou_substitution_b_m_athna')
                   }
                   
myView = hudson.model.Hudson.instance.getView(viewName)
myView.doAddJobToView('athna_cc_trigger') 
jenkins.save()
}

