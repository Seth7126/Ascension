// 函数: _ZN20NetworkClientManager24NetOptionListEndListenerEPvjPKcPFbP13CStateMachineS0_jittPjES0_
// 地址: 0x1860f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r6 = arg1 + 0x124
int32_t r4 = *(arg1 + 0xd4)
int32_t r7 = 0
int32_t r0 = 0x1c
void* r10 = nullptr
int32_t i = 0

do
    uint32_t r5_1 = zx.d(*(arg1 + r0))
    r0 += 0x30
    bool cond:0_1 = r5_1 == 0
    
    if (r5_1 == 0)
        r5_1 = arg1 + (r7 << 2)
        r10 = r6
    
    r6 += 0x34
    r7 += 1
    
    if (cond:0_1)
        i = *(r5_1 + 0xfc)
while (r7 s< r4)

char r6_1

if (r4 s< 1)
    r6_1 = 0
else
    void* r0_1 = arg1 + 0x14
    int32_t r7_1 = 0
    r6_1 = 0
    
    do
        void* r5_2 = *r0_1
        r0_1 += 0x30
        bool cond:1_1 = r5_2 == arg2
        
        if (r5_2 == arg2)
            r5_2 = r10 + (r7_1 << 2)
            r6_1 = (1 << r7_1).b
        
        r7_1 += 1
        
        if (cond:1_1)
            *(r5_2 + 0x24) = arg5
            *(r5_2 + 0x14) = arg4
    while (r4 != r7_1)

int32_t result = *(r10 + 0x10)

if (result == 0)
    return result

for (; i u< *(arg1 + 0x10c); i += 1)
    if (*(*(arg1 + 0x120) + (i << 4)) == arg2)
        return GameOptionManager::OptionListCancel(result, arg2, 
            NetworkClientManager::NetOptionSelectFunc) __tailcall

if (*(arg1 + 0xf8) != 3)
    *(arg1 + 0xd8) |= r6_1

void* var_28_1 = arg1
return GameOptionManager::OptionListEnd(result, arg2, arg3, 
    NetworkClientManager::NetOptionSelectFunc)
