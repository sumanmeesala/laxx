package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()



matrixJob('org_unit_hierarchy_b_m_athna_corpwise') {
    description('This is an org_unit_hierarchy_b_m_athna_corpwise Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im org_unit_hierarchy_b_m_athna_corpwise"')
    }
            publishers {
              downstream('employee_dim_attributes_b_m_athna')
                   }
                   
                                      
myView = hudson.model.Hudson.instance.getView(Athna)
myView.doAddJobToView('athna_cc_trigger') 
jenkins.save()

}

