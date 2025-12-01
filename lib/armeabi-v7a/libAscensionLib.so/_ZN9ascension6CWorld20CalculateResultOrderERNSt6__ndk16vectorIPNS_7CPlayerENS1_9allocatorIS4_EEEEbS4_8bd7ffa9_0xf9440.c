// 函数: _ZN9ascension6CWorld20CalculateResultOrderERNSt6__ndk16vectorIPNS_7CPlayerENS1_9allocatorIS4_EEEEbS4_
// 地址: 0xf9440
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer*** r7 = arg2
int32_t r0 = *__stack_chk_guard
*(arg2 + 4) = *arg2
void** r1 = nullptr
void** var_34 = nullptr
ascension::EndGamePlayerScore* var_38 = nullptr
int32_t var_30 = 0
int32_t r9 = *(arg1 + 0x18)
ascension::EndGamePlayerScore* r0_3 = nullptr
bool (* var_40)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&)

if (r9 != *(arg1 + 0x1c))
    int32_t r10_1 = 0
    int32_t r5_1 = 0
    
    do
        bool (* r8_1)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&) =
            *(r9 + (r5_1 << 2))
        var_40 = r8_1
        int32_t r7_1 = *(r8_1 + 0x90)
        int32_t r0_5 = ascension::CPlayer::GetHonorCardTotal()
        int32_t r4_1 = r0_5 + r7_1
        
        if (arg3 != 0)
            core::CWorldBase::OutputMessageFormat(arg1, 
                "%s has %d honor tokens and %d honor in cards for %d total honor\n", r8_1 + 0x10, 
                r7_1, r0_5, r4_1, r7, arg3)
        
        if (var_34 == var_30)
            std::__ndk1::vector<ascension::EndGamePlayerScore, std::__ndk1::allocator<ascension::EndGamePlayerScore> >::__push_back_slow_path<ascension::EndGamePlayerScore const&>(
                &var_38)
        else
            *var_34 = var_40
            var_34[1] = r5_1 | r4_1 << 4
            var_34 = &var_34[2]
        
        r10_1 += 4
        r5_1 += 1
    while (r9 + r10_1 != *(arg1 + 0x1c))
    
    r0_3 = var_38
    r1 = var_34

var_40 = ascension::SortPlayerScores
std::__ndk1::__sort<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
    r0_3, r1, &var_40)
int32_t entry_r3

if (entry_r3 != 0)
    int32_t* r1_5 = r7[1]
    
    if (r1_5 == r7[2])
        std::__ndk1::vector<ascension::CPlayer*, std::__ndk1::allocator<ascension::CPlayer*> >::__push_back_slow_path<ascension::CPlayer* const&>(
            r7)
    else
        *r1_5 = entry_r3
        r7[1] = &r7[1][1]

ascension::EndGamePlayerScore* r5_2 = var_38

if (r5_2 != var_34)
    do
        int32_t r0_17 = *r5_2
        
        if (r0_17 != entry_r3)
            int32_t* r1_7 = r7[1]
            
            if (r1_7 == r7[2])
                std::__ndk1::vector<ascension::CPlayer*, std::__ndk1::allocator<ascension::CPlayer*> >::__push_back_slow_path<ascension::CPlayer* const&>(
                    r7)
            else
                *r1_7 = r0_17
                r7[1] = &r7[1][1]
        
        r5_2 += 8
    while (r5_2 != var_34)
    
    r5_2 = var_38

if (r5_2 != 0)
    ascension::EndGamePlayerScore* var_34_1 = r5_2
    operator delete(r5_2)

int32_t r0_23 = *__stack_chk_guard

if (r0_23 == r0)
    return r0_23 - r0

__stack_chk_fail()
noreturn
