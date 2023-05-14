package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()



matrixJob('course_lineage_athna_b_m') {
    description('This is an course_lineage_athna_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im course_lineage_athna_b_m"')
    }
            publishers {
              downstream('user_lo_latest_lo_version_substitution_b_m_athna')
                   }
                   
 myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('course_lineage_athna_b_m') 
jenkins.save()

}

