// 函数: __emutls_get_address
// 地址: 0x1a9ca0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t (* r0)() = sub_1a9a94()

if (r0 == 0)
    if (arg1[2] == 0)
        arg1[2] = sub_1a9b20(arg1)
    
    return arg1[2]

int32_t r5 = arg1[2]

if (r5 == 0)
    int32_t r0_4
    int32_t r1
    int32_t r2
    int32_t r3_1
    r0_4, r1, r2, r3_1 = sub_1a9c3c(r0, arg2, arg3, arg4)
    int32_t (* r0_5)()
    int32_t r1_1
    int32_t r2_1
    int32_t r3_2
    r0_5, r1_1, r2_1, r3_2 = sub_1a9bcc(r0_4, r1, r2, r3_1)
    r5 = arg1[2]
    
    if (r5 == 0)
        r5 = data_1f5b4c + 1
        data_1f5b4c = r5
        arg1[2] = r5
    
    sub_1a9ba4(r0_5, r1_1, r2_1, r3_2)

int32_t r0_7 = j_pthread_getspecific(data_1f5b3c)
void* r4 = r0_7

if (r0_7 != 0)
    int32_t r8_1 = *(r4 + 4)
    
    if (r5 u> r8_1)
        int32_t r7_1 = r8_1 << 1
        
        if (r5 u> r7_1)
            r7_1 = r5 + 0x20
        
        void* r0_12 = realloc(r4, (r7_1 + 2) << 2)
        r4 = r0_12
        
        if (r0_12 == 0)
            abort()
            noreturn
        
        *(r4 + 4) = r7_1
        memset(r4 + ((r8_1 + 2) << 2), 0, (r7_1 - r8_1) << 2)
        j_pthread_setspecific(data_1f5b3c, r4)
else
    void* r0_9 = calloc(r5 + 0x22, 4)
    r4 = r0_9
    
    if (r0_9 == 0)
        abort()
        noreturn
    
    int32_t r0_10 = data_1f5b3c
    *r4 = 1
    *(r4 + 4) = r5 + 0x20
    j_pthread_setspecific(r0_10, r4)

void* r4_1 = r4 + (r5 << 2)
int32_t r0_15 = *(r4_1 + 4)

if (r0_15 != 0)
    return r0_15

void* r0_17 = sub_1a9b20(arg1)
*(r4_1 + 4) = r0_17
return r0_17
