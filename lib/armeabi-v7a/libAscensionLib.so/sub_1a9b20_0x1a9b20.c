// 函数: sub_1a9b20
// 地址: 0x1a9b20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = arg1[1]
int32_t r0 = *arg1
void* s

if (r5 u> 4)
    void* r0_5 = malloc(r5 + r0 + 3)
    
    if (r0_5 == 0)
        abort()
        noreturn
    
    s = (r0_5 + r5 + 3) & (0 - r5)
    *(s - 4) = r0_5
else
    void* r0_2 = malloc(r0 + 4)
    
    if (r0_2 == 0)
        abort()
        noreturn
    
    *r0_2 = r0_2
    s = r0_2 + 4

void* c = arg1[3]
uint32_t n = *arg1

if (c == 0)
    memset(s, c, n)
else
    memcpy(s, c, n)

return s
