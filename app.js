const express = require('express')
const app = express()
const port = 8888

app.get('/client/default', (req, res) => {
    const data = {
        "name": "client",
        "profiles": [
            "default"
        ],
        "label": null,
        "version": null,
        "state": null,
        "propertySources": [
            {
                "name": "cloudConfig",
                "source": {
                    "config": "default"
                }
            }
        ]
    }
    res.json(data)
})

app.get('/client/local', (req, res) => {
    const data = {
        "name": "client",
        "profiles": [
            "local"
        ],
        "label": null,
        "version": null,
        "state": null,
        "propertySources": [
            {
                "name": "cloudConfig",
                "source": {
                    "config": "local"
                }
            }
        ]
    }
    res.json(data)
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})
