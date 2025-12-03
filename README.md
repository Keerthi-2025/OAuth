 **⭐ Google OAuth 2.0 Setup (Google Cloud Console)**

This guide explains how to configure **Google OAuth 2.0** credentials in the **Google Cloud Console** for use in your application.

---

 **1. Create a Google Cloud Project**

1. Go to **Google Cloud Console** → [https://console.cloud.google.com/](https://console.cloud.google.com/)
2. Click **Select a project** → **New Project**
3. Enter a project name and click **Create**

---

 **2. Enable Google OAuth APIs**

1. In the left sidebar, go to **APIs & Services → Library**
2. Search for **"Google Identity Services"** or **"Google OAuth 2.0"**
3. Click **Enable**

---

 **3. Configure OAuth Consent Screen**

1. Go to **APIs & Services → OAuth consent screen**
2. Choose **External** (if users outside your org will log in)
3. Fill in required fields:

   * App name
   * User support email
   * Developer contact email
4. Add any required **Scopes** (email, profile, etc.)
5. Add **Test Users** (if app is in testing mode)
6. Save & continue

---

**4. Create OAuth Credentials**

1. Go to **APIs & Services → Credentials**
2. Click **Create Credentials → OAuth client ID**
3. Select your application type:

   * **Web application**
   * **Android**
   * **iOS**
   * **Desktop**
4. For **Web applications**, configure:

   * **Authorized JavaScript origins**

     ```
     https://your-domain.com
     http://localhost:3000
     ```
   * **Authorized redirect URIs** (very important)

     ```
     https://your-domain.com/auth/google/callback
     http://localhost:3000/auth/google/callback
     ```
5. After saving, Google provides:

   * **Client ID**
   * **Client Secret**

Store these securely (e.g., in environment variables).

---

 **5. Add Environment Variables** 

```
GOOGLE_CLIENT_ID=your_client_id
GOOGLE_CLIENT_SECRET=your_client_secret
GOOGLE_REDIRECT_URI=http://localhost:3000/auth/google/callback
```

---


 **7. Publishing the App**

If you want to make the OAuth app public:

1. Go to **OAuth consent screen**
2. Click **Publish App**
3. Google may require verification depending on scopes.

---

