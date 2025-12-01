// 函数: _ZNK9ascension6CWorld23GetPlayerTurnOrderIndexEPNS_7CPlayerES2_
// 地址: 0xf3a2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg1 + 0x18)
int32_t* r12 = *(arg1 + 0x1c)
int32_t* lr = r6

if (r6 == r12)
    goto label_f3aa8

void* i_1 = r12 - r6
int32_t* r4_1 = r6

while (*r4_1 != arg2)
    r4_1 = &r4_1[1]
    i_1 -= 4
    
    if (r4_1 == r12)
        goto label_f3aa4

int32_t result
int32_t entry_r2

if (r4_1 == r12)
label_f3aa4:
    lr = r12
label_f3aa8:
    result = 0
    
    if (r6 != lr)
    label_f3ab4:
        
        while (true)
            int32_t r3_1 = *r6
            
            if (r3_1 == arg2)
                return 0xffffffff
            
            if (r3_1 == entry_r2)
                return result
            
            r6 = &r6[1]
            result += 1
            
            if (lr == r6)
                return 0xffffffff
else
    result = 0
    void* i
    
    do
        if (r4_1[result] == entry_r2)
            return result
        
        i = i_1
        i_1 -= 4
        result += 1
    while (i != 4)
    lr = r12
    
    if (r6 != lr)
        goto label_f3ab4
return 0xffffffff
