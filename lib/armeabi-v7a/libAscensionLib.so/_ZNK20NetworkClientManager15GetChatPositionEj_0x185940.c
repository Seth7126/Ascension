// 函数: _ZNK20NetworkClientManager15GetChatPositionEj
// 地址: 0x185940
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0xdc)
int32_t r12 = *(arg1 + 0xe0)

if (r3 != r12)
    do
        void* lr_1 = *r3
        r3 = &r3[1]
        int32_t entry_r1
        
        if (*(lr_1 + 4) == entry_r1)
            if (lr_1 == 0)
                return 0
            
            if (zx.d(*(lr_1 + 0x1c)) == 0 || zx.d(*(lr_1 + 0x4c)) == 0 || zx.d(*(lr_1 + 0x7c)) == 0)
                return *(lr_1 + 0xa24)
            
            if (zx.d(*(lr_1 + 0xac)) == 0)
                return *(lr_1 + 0xa24)
            
            return 0
    while (r12 != r3)

return 0
