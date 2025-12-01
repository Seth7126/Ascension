// 函数: _ZN9ascension7CEffect9AddEffectEP9lua_State
// 地址: 0xe64c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
char* s = lua_tolstring(arg1, 2, 0)
char* r9_1

if (lua_isnumber(arg1, 3) == 0)
    if (lua_isstring(arg1, 3) == 0)
        r9_1 = nullptr
        
        if (lua_type(arg1, 3) == 2)
            r9_1 = lua_touserdata(arg1, 3)
    else
        r9_1 = nullptr
        char* s_2 = lua_tolstring(arg1, 3, 0)
        strlen(s_2)
        char* r0_29 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)
        
        if (r0_29 != 0)
            strcpy(r0_29, s_2)
            r9_1 = r0_29
else
    r9_1 = lua_tointegerx(arg1, 3, 0)

void* r0_16

if (lua_gettop(arg1) != 3)
    if (lua_gettop(arg1) == 5)
        char* r4_1 = nullptr
        char* s_1 = lua_tolstring(arg1, 4, 0)
        
        if (lua_isnumber(arg1, 5) == 0)
            if (lua_isstring(arg1, 5) != 0)
                r4_1 = nullptr
                char* s_3 = lua_tolstring(arg1, 5, 0)
                strlen(s_3)
                char* r0_38 = ascension::CDatabase::AllocateTextBuffer(ascension::g_Database)
                
                if (r0_38 != 0)
                    strcpy(r0_38, s_3)
                    r4_1 = r0_38
        else
            r4_1 = lua_tointegerx(arg1, 5, 0)
        
        uint32_t r0_40 = strlen(s_1)
        strncpy(r0 + 0x98 + *(r0 + 0x94) * 0x90, s_1, 0x40)
        *(r0 + 0x98 + *(r0 + 0x94) * 0x90 + 0x3f) = 0
        *(r0 + 0x98 + *(r0 + 0x94) * 0x90 + r0_40) = 0
        int32_t r0_51 = ascension::FindEffectConditionFunc(s_1)
        void* r4_2 = r0 + 0x98 + *(r0 + 0x94) * 0x90
        *(r4_2 + 0x40) = r0_51
        *(r4_2 + 0x44) = r4_1
        uint32_t r0_53 = strlen(s)
        strncpy(r4_2 + 0x48, s, 0x40)
        void* r0_57 = r0 + 0x98 + *(r0 + 0x94) * 0x90
        *(r0_57 + 0x87) = 0
        r0_16 = r0_57 + r0_53
        goto label_e675c
else
    void* r1_2 = r0 + 0x98 + *(r0 + 0x94) * 0x90
    *r1_2 = 0
    *(r1_2 + 0x40) = 0
    *(r1_2 + 0x44) = 0
    uint32_t r0_11 = strlen(s)
    strncpy(r1_2 + 0x48, s, 0x40)
    void* r0_15 = r0 + 0x98 + *(r0 + 0x94) * 0x90
    *(r0_15 + 0x87) = 0
    r0_16 = r0_15 + r0_11
label_e675c:
    *(r0_16 + 0x48) = 0
    int32_t r0_60 = ascension::FindEffectFunc(s)
    int32_t r1_12 = *(r0 + 0x94)
    void* r2_3 = r0 + r1_12 * 0x90
    *(r2_3 + 0x120) = r0_60
    *(r2_3 + 0x124) = r9_1
    *(r0 + 0x94) = r1_12 + 1
return 0
