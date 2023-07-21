# Scope

Included in this schema are Interops resource events and supporting 
data for resource tracking and flow control.

### MetaData

MetaData is an optional (and thus passive)
object that contains any amount of tracking data
that Interops may want to provide.

### FlowOptions

Provides a way to differentiate downstream processing when getting 
re-processing requests from data platform vss validation server:

- Data Platform reloads only reload the specific entities (nothing downstream).
- Validation trigger downstream processing.
- Both cases ensure the data normalization registry and mappings 
  are refreshed in the Interops cache.

FlowOptions is an optional (and thus passive) 
object that contains any number of optional flow controls 
that Interops may want to provide.

# Links
- [Event Contract Management Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1797521454/Event+Contract+Management+Standard)
- [Ronin Event Standard](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1748041738/Ronin+Event+Standard)
- [Event Topic Standards](https://projectronin.atlassian.net/wiki/spaces/ENG/pages/1765998701/Event+Topic+Standards)
- [Event Contract Tooling Docker Image](https://github.com/projectronin/ronin-contract-event-tooling)
- [Event Contract CI/CD Workflow](https://github.com/projectronin/github/blob/event_contract_cicd/.github/workflows/event_contract_cicd.yaml)
