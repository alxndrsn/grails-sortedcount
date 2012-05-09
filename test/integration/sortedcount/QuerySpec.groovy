package sortedcount

class QuerySpec extends grails.plugin.spock.IntegrationSpec {
	def 'list works'() {
		expect:
			Something.query.list() == []
	}

	def 'count does not'() {
		expect:
			Something.query.count() == 0
	}
}
