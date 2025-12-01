// 函数: _ZN14ascensionrules22CStatePrepareCenterRow16FindClonePointerEPv
// 地址: 0x16559c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)

if (r2_3 != 0)
    int32_t entry_r1
    
    if (r2_3 + 0x3c == entry_r1)
        return arg1 + 0 + 0x3c
    
    if (r2_3 + 0xc0 == entry_r1)
        return arg1 + 0x84 + 0x3c
    
    if (r2_3 + 0x144 == entry_r1)
        return arg1 + 2 * 0x84 + 0x3c
    
    if (r2_3 + 0x1c8 == entry_r1)
        return arg1 + 3 * 0x84 + 0x3c
    
    if (r2_3 + 0x24c == entry_r1)
        return arg1 + 4 * 0x84 + 0x3c
    
    if (r2_3 + 0x2d0 == entry_r1)
        return arg1 + 5 * 0x84 + 0x3c
    
    if (r2_3 + 0x354 == entry_r1)
        return arg1 + 6 * 0x84 + 0x3c

int32_t* r0 = *(arg1 + 4)

if (r0 == 0)
    return 0

jump(*(*r0 + 0x2c))
