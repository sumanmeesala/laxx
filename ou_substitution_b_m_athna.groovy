package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()



matrixJob('ou_substitution_b_m_athna') {
    description('This is an ou_substitution_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im ou_substitution_b_m_athna"')
    }
            publishers {
              downstream('course_lineage_athna_b_m')
              downstream('org_unit_hierarchy_b_m_athna_corpwise')
                   }
                   
                                      
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('athna_cc_trigger') 
jenkins.save()

}

