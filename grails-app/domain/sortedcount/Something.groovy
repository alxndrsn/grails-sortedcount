package sortedcount

class Something {
	Date dateCreated

	static namedQueries = {
		query {
			order 'dateCreated', 'desc'
		}
	}
}
