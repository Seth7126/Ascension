// 函数: sub_19e550
// 地址: 0x19e550
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

while (true)
    int32_t* r0 = *(arg1 + 0x1170)
    
    if (r0 == 0)
        break
    
    *(arg1 + 0x1170) = *r0
    
    if (arg1 + 0x170 != r0)
        operator delete[](r0)

*(arg1 + 0x170) = 0
*(arg1 + 0x174) = 0
*(arg1 + 0x1170) = arg1 + 0x170
void* r0_1 = *(arg1 + 0x14c)

if (r0_1 != arg1 + 0x158)
    free(r0_1)

sub_19e5b0(arg1 + 0x120)
sub_19e5c8(arg1 + 0x94)
sub_19e5c8(arg1 + 8)
return arg1
