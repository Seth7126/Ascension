// 函数: _ZN9ascension29CEventPreventDestroyConstruct22RemoveDestroyConstructEPNS_18CConstructInstanceE
// 地址: 0xe9578
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0x50)
int32_t r2 = *(arg1 + 0x54)

if (r3 == r2)
    return 0

int32_t entry_r1
void* r5_2

if (*r3 == entry_r1)
    r5_2 = r3
else
    bool cond:0_1
    
    do
        if (r2 - 4 == r3)
            return 0
        
        r5_2 = &r3[1]
        cond:0_1 = r3[1] != entry_r1
        r3 = r5_2
    while (cond:0_1)

if (r2 != r5_2 + 4)
    __aeabi_memmove4(r5_2)

*(arg1 + 0x54) = r5_2 + ((r2 - (r5_2 + 4)) s>> 2 << 2)
return 1
