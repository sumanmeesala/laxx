
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('user_lo_latest_lo_version_substitution_b_m_athna') {
    description('This is an user_lo_latest_lo_version_substitution_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im user_lo_latest_lo_version_substitution_b_m_athna"')
    }
            publishers {
              downstream('courses_main')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('user_lo_latest_lo_version_substitution_b_m_athna') 
jenkins.save()

}
