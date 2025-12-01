// 函数: NetworkGetFriendsList
// 地址: 0x19b1bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = arg2
uint32_t r6 = *s_pNetworkClientManager
int32_t* r0 = *(r6 + 0x514)
void* r1_1 = *(r6 + 0x518) - r0

if (result s>= r1_1 s>> 2)
    result = r1_1 s>> 2

if (result s>= 1)
    int32_t* r1_2 = *r0
    *arg1 = *r1_2
    arg1[1].w = r1_2[1].w
    *(arg1 + 6) = *(r1_2 + 6)
    strncpy(&arg1[2], &r1_2[2], 0x20)
    *(arg1 + 0x27) = 0
    
    if (result != 1)
        void* r5_1 = &arg1[0xa]
        int32_t r7_1 = 1
        
        do
            int32_t* r0_6 = *(*(r6 + 0x514) + (r7_1 << 2))
            *r5_1 = *r0_6
            *(r5_1 + 4) = r0_6[1].w
            *(r5_1 + 6) = *(r0_6 + 6)
            strncpy(r5_1 + 8, &r0_6[2], 0x20)
            *(r5_1 + 0x27) = 0
            r7_1 += 1
            r5_1 += 0x28
        while (r7_1 s< result)

return result
