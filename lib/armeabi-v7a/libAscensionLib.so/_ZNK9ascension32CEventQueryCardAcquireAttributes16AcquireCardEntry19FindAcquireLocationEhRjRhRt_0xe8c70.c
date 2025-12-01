// 函数: _ZNK9ascension32CEventQueryCardAcquireAttributes16AcquireCardEntry19FindAcquireLocationEhRjRhRt
// 地址: 0xe8c70
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *(arg1 + 0x40)
int16_t r0_1

if (r5 == 0xffffffff || zx.d(*(arg1 + r5 + 0x20)) != arg2)
    int32_t lr_1 = *(arg1 + 0x1c)
    
    if (lr_1 s< 1)
        return 0
    
    int32_t r5_1 = 0
    int32_t r4_1 = 0x30
    
    while (true)
        void* r6_3 = arg1 + r5_1
        
        if (zx.d(*(r6_3 + 0x20)) == arg2)
            *arg3 = r5_1
            *arg4 = *(r6_3 + 0x28)
            r0_1 = *(arg1 + r4_1)
            break
        
        r5_1 += 1
        r4_1 += 2
        
        if (r5_1 s>= lr_1)
            return 0
else
    *arg3 = r5
    *arg4 = *(arg1 + *(arg1 + 0x40) + 0x28)
    r0_1 = *(arg1 + (*(arg1 + 0x40) << 1) + 0x30)

int16_t* arg_0
*arg_0 = r0_1
return 1
