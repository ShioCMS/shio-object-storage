/*
 * Copyright (C) 2016-2019 Alexandre Oliveira <alexandre.oliveira@viglet.com> 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.shiohara.objectstorage.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.viglet.shiohara.objectstorage.bean.Contents;
import com.viglet.shiohara.objectstorage.bean.ListBucketResult;
import com.viglet.shiohara.objectstorage.bean.Owner;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/mybucket")
@Api(value = "/mybucket", tags = "MyBucket", description = "MyBucket")
public class ShOSBucketAPI {

	/**
	 * 
	 * GET /mybucket?list-type=2&delimiter=%2F&prefix=&encoding-type=url HTTP/1.1
	 * Host: localhost:8090 Accept-Encoding: identity X-Amz-Content-SHA256:
	 * e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855 X-Amz-Date:
	 * 20190822T155555Z Authorization: AWS4-HMAC-SHA256
	 * Credential=Q3AM3UQ867SPQQA43P2F/20190822/us-east-1/s3/aws4_request,
	 * SignedHeaders=host;x-amz-content-sha256;x-amz-date,
	 * Signature=f0dae8a5b91ff45420b3e004dddd60e9b17341785cdf1573777fc5d4ae807cf2
	 * User-Agent: aws-cli/1.16.220 Python/2.7.10 Darwin/18.7.0 botocore/1.12.210
	 * 
	 * https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGET.html
	 */
	@GetMapping(produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE)
	public ListBucketResult myBucket(@RequestHeader(required = false, value = "Authorization") String authorization,
			@RequestHeader(required = false, value = "Credential") String credential,
			@RequestHeader(required = false, value = "SignedHeaders") String signedHeaders,
			@RequestHeader(required = false, value = "Signature") String signature,
			@RequestHeader(required = false, value = "X-Amz-Content-SHA256") String amzContentSHA256,
			@RequestHeader(required = false, value = "X-Amz-Date") String amzDate,
			@RequestParam(required = false, value = "list-type") String listType,
			@RequestParam(required = false, value = "delimiter") String delimiter,
			@RequestParam(required = false, value = "prefix") String prefix,
			@RequestParam(required = false, value = "encoding-type") String encodingType) {

		System.out.println(String.format("Authorization", authorization));
		System.out.println(String.format("Credential", credential));
		System.out.println(String.format("SignedHeaders", signedHeaders));
		System.out.println(String.format("Signature", signature));
		System.out.println(String.format("X-Amz-Content-SHA256", amzContentSHA256));
		System.out.println(String.format("X-Amz-Date", amzDate));
		System.out.println(String.format("list-type", listType));
		System.out.println(String.format("delimiter", delimiter));
		System.out.println(String.format("prefix", prefix));
		System.out.println(String.format("encoding-type", encodingType));

		ListBucketResult shOSMyBucket = new ListBucketResult();
		shOSMyBucket.setName("mybucket");
		shOSMyBucket.setMaxKeys(1000);
		shOSMyBucket.setTruncated(false);

		Contents contents = new Contents();
		contents.setKey("my-image.jpg");
		contents.setLastModified(new Date());

		contents.seteTag("&quot;fba9dede5f27731c9771645a39863328&quot;");
		contents.setSize(1234);

		Owner owner = new Owner();
		owner.setId("75aa57f09aa0c8caeab4f8c24e99d10f8e7faeebf76c078efc7c6caea54ba06a");
		owner.setDisplayName("mtd@amazon.com");

		contents.setOwner(owner);

		shOSMyBucket.setContents(contents);

		return shOSMyBucket;
	}
}
